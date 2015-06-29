# BubbleMail
A system to help parents administer a child's email account

## Background
As a father, I was frustrated by the dearth of options for setting up an email account for my children. I wanted something very limited at first, but with the ability to slowly remove restrictions as the children grew and were able to assume more responsibility. A webmail solution is ideal, but currently available webmail providers couldn't (or wouldn't) assure me that they won't turn around and sell my children's data, so I decided to roll my own.

## Overview
BubbleMail is essentially a webmail client for the child, associated with any email service that provides IMAP (so basically any email service), along with an administrative interface for the parent. The intent is for BubbleMail, at its most restrictive, to allow the parent to define a whitelist of email addresses, with whom the child is allowed to communicate. Emails received from addresses not on the whitelist will be placed in a holding area pending a parent's approval. Restrictions can be relaxed over time, and when the parent decides it's appropriate, the child can begin using a standard webmail client, thus gaining full access to their account without having to transition the email.
As I'm a fairly busy individual (what parent isn't), my goal is to start with a minimal set of features, and add to them as my children grow.
