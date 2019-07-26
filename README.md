Framework requirement:
• BDD based project
• Selenium WebDriver with Java (or C#), Maven/POM (or .NET)
• Using page object model
• Support cross browser

Application flow:
1. Go to https://www.saiglobal.com/
2. Click LOGIN->Infostore
3. Type ISO 9001 in the Search box and Search within Standards, then click GO
4. CLICK ISO 9001:2015 in the search result
5. Select and Add
o PRODUCT FORMAT: Hardcopy – English
o QUANTITY: 02
6. Select and Add
o PRODUCT FORMAT: PDF – English
o QUANTITY: 01
7. Click CART top menu item
8. Click the checkbox I agree to the document licence rules
9. Click PROCEED TO CHECKOUT
10. Click CONTINUE AS A GUEST USER in the login popup
11. Enter all the fields in BILLING DETAILS and Click CONTINUE
12. Click Use my billing details for shipping on SHIPPING ADDRESS page and CLICK CONTINUE
13. On Checkout page
o Verify the Hardcopy product price is the same in the product page (step5)
o Verify the PDF product price is the same in the product page (step6)
o Verify Products Subtotal is the sum of all selected products
o Click CONTINUE
14. On Payment Details page
o Select Pay By VISA/MasterCard
o Purchase Order Number: TEST
o Click Continue
