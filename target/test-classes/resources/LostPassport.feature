Feature: Reporting lost or stolen passport
    As an Automation Test Team
    In order to test the lost or stolen user interface 
    I want to a web driver project driven by BDD story

    Scenario: Connect to LSR ui 
        Given an instance of "firefox" browser 
        When the url "https://www-preprod-lsr.pex.ips.gov.uk/" is opened
        Then the lost or stolen user interface is presented
       