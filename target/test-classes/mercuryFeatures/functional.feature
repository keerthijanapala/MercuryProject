Feature: Test Mercury Application
Background:
Given As user i need to be mercuryhomepage
Scenario: Verify username field
As a end user i want to check username textbox is accepting text or not
When user enter mercury username
Then verify mercury username text box contains text or not 
Then close mercury browser 

Scenario: Verify password field
As a end user i want to check password textbox is accepting text or not
When user enter mercury username
And user enter password as "mercury"
Then verify mercury password text box contains text or not 
Then close mercury browser 

Scenario: Verify Login button
When user enter mercury uname
|username|
|mercury|
|Rakesh|
|Admin|
And user enter mercury pass
|password|
|mercury|
|rakesh123|
|admin23|
Then click on signin button
And verify url
And close mercury browser
