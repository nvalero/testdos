const { defineConfig } = require("cypress");
const createBundler = require("@bahmutov/cypress-esbuild-preprocessor");
const addCucumberPreprocessorPlugin =
  require("@badeball/cypress-cucumber-preprocessor").addCucumberPreprocessorPlugin;
const createEsbuildPlugin =
  require("@badeball/cypress-cucumber-preprocessor/esbuild").createEsbuildPlugin;

//If using this approach, just call the key "setupNodeEvents" in the E2E configurations
// async function setupNodeEvents(on, config) {
//   await addCucumberPreprocessorPlugin(on, config);
//   on(
//     "file:preprocessor",
//     createBundler({
//       plugins: [createEsbuildPlugin(config)],
//     })
//   );
//   return config;
// }

module.exports = defineConfig({
  e2e: {
    async setupNodeEvents(on, config) {
      const bundler = createBundler({
        plugins: [createEsbuildPlugin(config)],
      });

      on("file:preprocessor", bundler);
      await addCucumberPreprocessorPlugin(on, config);
    /** */
      on("before:browser:launch", (browser, launchOptions) => {
        if (browser.name === "chrome") {
          launchOptions.args.push("--disable-web-security");
          return launchOptions;
        }
      });

      return config;
    },
    defaultCommandTimeout: 10000, // Time, in milliseconds, to wait until most DOM based commands are considered timed out
    responseTimeout: 30000, // Time, in milliseconds, to wait until a response in a cy.request(), cy.wait(), cy.fixture(), cy.getCookie(), cy.getCookies(), cy.setCookie(), cy.clearCookie(), cy.clearCookies(), and cy.screenshot() commands
    numTestsKeptInMemory: 10, // The number of tests for which snapshots and command data are kept in memory. Reduce this number if you are experiencing high memory consumption in your browser during a test run
    chromeWebSecurity: false,
    chromeArgs: ["/Users/hector.martin/Library/Application"],
    video: false,
    specPattern: "cypress/e2e/features/*.feature",
    baseUrl: "https://qa.headway.gdmseeds.com",
    chromeWebSecurity: false,
    experimentalModifyObstructiveThirdPartyCode: true,
    env: {
      "MSAL_CLIENT_ID": "410cf032-5764-4a15-b112-be4d006e8345",
      "MSAL_TENANT_ID": "437eb63a-e141-45e6-a328-6034f4036fd5",
    },
    
  },
});

