Feature: placeorder 

Scenario: Search product and place order 

	Given user is on the home page 
	When user searches for product "8925497" 
	And user selects the product 
	And user clicks on add to cart button 
	And user clicks on View cart&checkout button 
	And user select prefered shipping method as ship to home 
	And user clicks on checkout as guest button 
	And user fills personal details and clicks continue 
	Then user reaches on shipping page 
	
	