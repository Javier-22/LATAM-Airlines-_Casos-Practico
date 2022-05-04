@story
  Feature:Verify the operation of the different options offered by the Open Cart page
          in the administration of customizable e-commerce stores.

          As a user,
          I want to verify the operation of the openCart options
          for the administration of e-commerce stores.

 Background:
   Given that the user wants to enter the Open Car page
   When the user enters the credentials to enter the system
     |strUserName|strpassword  |
     |demo       |demo         |

@caseOne
  Scenario:add a new product without having the permissions
  And register a product
    |strProducName                |strDescription            |strMetaTagTitle  |strMetaTagDescription     |strMetaTagKeywords|strProductTags |
    |Lenovo - ThinkBook           | Latest generation laptop |  Laptop Lenovo  | latest generation laptop |     LLG          | LLGTB         |
  Then verify that the following error appears Warning: You do not have permission to modify products!
    @caseTwo
    Scenario:fill the data to filter
      And fill the data to filter
      |strProduct_Name|strModel       |strPrice      |strStatus       |
      |  HP LP3065    | Product 21    | 100.00       | Enabled        |
      Then the user should be able to click the box in the first column of the table
      @caseThree
      Scenario:select a product and edit it
        And we filter the product to edit
        |strProduct_Name      |
        |Apple Cinema 30      |
        Then verify that the following error message appears Warning: You do not have permission to modify products!


