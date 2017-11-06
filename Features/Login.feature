Feature: A Provider login in to the provider portal and search page is shown after login

     Scenario: Provider logs-in to the provider portal
          Given Open Chrome and start application 
          Given username exists in the database
               And password is valid in the database
          When provider user is on the login page
               And enters valid "admin" and "admin"
               And hits the login button
          Then login provider and show the forms coming-in from the consumers
          Then  Click on Logout button

    Scenario: Invalid provider user tries to login to the provider portal
          Given username does not exist in the database
          When provider user is on the login page
               And enters invalid "admin1" and "admin1"
               And hits the login button
          Then show message to the provider on the login page "Invalid username"
          Then Close Chrome browser 