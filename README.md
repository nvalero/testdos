# hw-automation-web-ui
# cypress-cucumber-GDM-Seeds-for-Web-UI-automation-testing

<img src="https://media-exp1.licdn.com/dms/image/C4E0BAQF1dg2KtKFdPg/company-logo_200_200/0/1626295436859?e=2159024400&v=beta&t=Ib_T9PXXQxkHRKnj3Oe65EKuR6EAh01IgAA6IGvU0FY" alt="Cypress Image">

<img src="https://www.gdmseeds.com/wp-content/uploads/2023/02/gdm-tag-h-en.svg" alt="GDMSeeds Image">

> Cypress 12+ with Cucumber.

# Automation

GDM Seeds
Automation Framework for web UI testing
Configuration for multiple browsers and environments

### Prerequisites

* Visual Studio Code
* NodeJS
* json-formatter, for HTML Reports: https://github.com/cucumber/json-formatter
* Configuration of CI for GitHub Actions in the /.github/workflows/ file

### Installing and Running the tests

1. Clone the repository
2. Navigate to default develop branch
3. Execute "npm i --legacy-peer-deps" to execute dependencies
4. Install cypress.io's latest version: npm install cypress --save-dev
5. Install API Cypress pluggin: npm i cypress-plugin-api --legacy-peer-deps
6. Install azure/msal browser package: npm install @azure/msal-browser --legacy-peer-deps
7. Execute the following commands in your favorite terminal:
    - "npm run cypress:runner"
    - "npm run cypress:execution"
    - to run a specific feature: npm run cypress:execution -- --spec "cypress/e2e/features/nursery.modifyNewSerie.feature"
8. To excecute de report run
    - "node cucumber-html-report.js"
    - "node cucumber-report.html"

            
