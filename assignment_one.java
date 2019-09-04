/*	Class:			CSE 1321L
	Section: 		28     
	Term:			FALL
	Instructor:		DEXTER HOWARD
	Name:			SAM BALLARD    
	ASSIGNMENT#: 	1				*/

Problem 1: Red, Green or Blue? 

MAIN
	BEGIN
		CREATE red //create variable
		CREATE green
		CREATE blue
		PRINT Enter a red value (0-255): //prints direcitons for user
		READ user input //gets input from user
		red ← user input //stores user input to variable
		PRINT Enter a green value between (0-255):
		READ user input
		green ← user input
		PRINT Enter a blue value between (0-255): 
		READ user input
		blue ← user input
		red ← color_1/255 //converts to new range
		green ← color_2/255
		blue ← color_3/255
		PRINT Enter a red value (0-255): //displays output
		PRINT Enter a green value (0-255):
		PRINT Enter a blue value (0-255): 
		PRINT New color is red= red, green= green, blue= blue
	END
	
	Program 2: You’re McAwesome™! 

MAIN
	BEGIN
		CREATE make_price //create variables
		CREATE sell_price
		CREATE sell_amount
		CREATE sales
		CREATE tax
		CREATE tax_pay
		CREATE pre_tax
		CREATE profit
		PRINT Enter the cost to make the meal: //print to user
		READ user input //read user input
		make_price ← user input //assign user input to variables
		PRINT Enter how much you will sell the meal for:
		READ user input
		sell_price ← user input
		PRINT Enter how many you think you will sell:
		READ user input
		sell_amount ← user input
		PRINT Enter the tax rate for the state: 
		READ user input
		tax ← user input
		sales ← (sell_price * sell_amount) //multiply price of meal by projected sales, assign to variable
		tax_pay ← sales * tax // mulitply var sales by var tax, store as new variable
		pre_tax ← sales - (make_price * sell_amount) //multiply cost to make meal by projected sales and subtract from var sales, store as variable
		profit ← pre_tax - tax_pay //subtract var pre_tax from var tax_pay, store as varaible
		PRINT This campaign will make: profit //display var profit to user
	END
	
Program 3: Assume that the McHamberger™

MAIN
	BEGIN
		CREATE cals_per_day //create vars
		CREATE normie_cals ← 2500
		CREATE num_days
		CREATE surp_cals
		CREATE total_cals
		CREATE weight_change
		PRINT Enter the number of calories you will consume per day: //query user 
		READ user input //read user input
		cals_per_day ← user input //assign user input to vars
		PRINT Enter the number of days you will eat this much: 
		READ user input
		num_days ← user input
		surp_cals ← cals_per_day - normie_cals //calc surplus calories by subtracting normal cals from user input calories per day, store as var
		total_cals ← surp_cals * num_days //multiply surplus cals by number of days to get total calories, store as var
		weight_change ← total_cals/3600 //divide total cals by 3600 to get pounds gained or lost
		PRINT Calorie intake per day: cals_per_day //print output to user
		PRINT Number of days on diet: num_days
		PRINT Weight change: weight_change lbs
	END
	
Program 4: But I haven’t taken Calculus yet!

MAIN
	BEGIN
		CREATE num
		CREATE result
		PRINT Enter a number: 
		READ user input
		num ← user input
		result ← (num+1)*n/2
		PRINT The sum of the numbers between 1 and num is result
	END

Program 5: I want an A

MAIN
	BEGIN
		CREATE test_1 //create vars
		CREATE test_2
		CREATE test_3
		CREATE test_4
		CREATE quiz
		CREATE attendance
		CREATE att_credit
		CREATE pre_att_grade
		CREATE final_grade
		PRINT Enter your grade for Test 1: //query user 
		READ user input //take input from user
		test_1 ← user input //assign user input to vars
		PRINT Enter your grade for Test 2:
		READ user input
		test_2 ← user input
		PRINT Enter your grade for Test 3: 
		READ user input
		test_3 ← user input
		PRINT Enter your grade for Test 4:
		READ user input
		test_4 user input
		PRINT Enter your average quiz grade: 
		READ user input
		quiz ← user input
		PRINT Enter the number of times you attended class: 
		READ user input
		attendance ← user input
		att_credit ← (attendance/30) * 1.5 //divide user input attendance by 30, mult. result by 1.5, store as var
		pre_att_grade ← (test_1 + test_2 + test_3 + test_4 + quiz) / 5 //take the average of tests and quizes, store as var
		final_grade ← pre_att_grade + att_credit //sum previous two vars created to get final grade
		PRINT Your average before attendance is pre_att_grade. //print results to user
		PRINT You recieve an additional att_credit points for attendance.
		PRINT Final grade is final_grade.
	END