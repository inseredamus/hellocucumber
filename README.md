helloCucumber
created from https://cucumber.io/docs/guides/10-minute-tutorial/

run specific test : mvn clean test -Dcucumber.options="--name (Scenario1|Scenario2)"

All non [a-zA-Z] characters need to be replace by their ascii code, for example spaces must be replaced by ‘\040’ : “Scenario A” need to appear as “Scenario\040A”.