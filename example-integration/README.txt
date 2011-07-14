Zuora Integration with Salesforce Demo
======================================

INTRODUCTION
   This demo shows how to migrate Account from Salesforce to Zuora and back

HOW TO DEMO:
  1. Set the following environment variables:
  	* zuoraUsername the Zuora login username 
  	* zuoraPassword the Zuora login password
  	* salesforceUsername 
  	* salesforcePassword
  	* salesforceSecurityKey
  	
  2. Run the ZuoraFunctionalTestDriver, or deploy this demo an a Mule Container. 
  	a. Migrate Accounts from Zuora to Salesforce. Run testMigrateZuora or
  		hit  http://localhost:9091/zuora-demo-integration-migrate-zuora
  	a. Migrate Accounts from Salesforce to Zuora. Run MigrateSalesforce or 
  		hit  http://localhost:9091/zuora-demo-integration-migrate-salesforce 
 	
