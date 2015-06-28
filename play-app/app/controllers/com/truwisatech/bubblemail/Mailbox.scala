package controllers.com.truwisatech.bubblemail

import java.util.Properties
import javax.mail.{Folder, Session}

import models.com.truwisatech.bubblemail.Constants
import play.api.mvc.{Action, Controller}

/**
 * Created by Samuel B. Johnson on 6/7/15.
 * Unless specified elsewhere, this code is copyright 2015
 * and is licensed under the terms of the AGPL 3.0
 */

class Mailbox extends Controller {
	
	val props = new Properties
	val provider = "imap"
	
	def allMail = Action { request =>
		var message = "connected"
		
		try {
			val session = Session.getDefaultInstance(props, null)
			val store = session.getStore(provider)
			store.connect(Constants.host, Constants.user, Constants.pass)
			
			val inbox = store.getFolder("Inbox")
			inbox.open(Folder.READ_ONLY)
			
			message = (inbox.getMessages map { m =>
				s"message from ${m.getFrom.mkString("")}: ${m.getSubject}"
			}).mkString(", ")
			
		} catch {
			case e: Exception => message = e.getMessage
		}

		Ok(views.html.com.truwisatech.bubblemail.mailbox(message))
	}
}
