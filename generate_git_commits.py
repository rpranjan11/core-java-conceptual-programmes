import os
import random
from datetime import datetime

# List of (month, days) for generating valid weekday dates
commit_months = [
    ("2019-10", 31), ("2019-11", 30), ("2019-12", 31),
    ("2020-02", 29),
    ("2021-11", 30), ("2021-12", 31),
    ("2022-05", 31), ("2022-11", 30), ("2022-12", 31),
    ("2023-03", 31), ("2023-04", 30), ("2023-06", 30),
    ("2023-08", 31), ("2023-09", 30)
]

def generate_weekdays(months):
    dates = []
    for year_month, max_day in months:
        year, month = map(int, year_month.split("-"))
        for day in range(1, max_day + 1):
            date = datetime(year, month, day)
            if date.weekday() < 5:  # Monday–Friday
                dates.append(date)
    return dates

def random_time(date):
    hour = random.randint(9, 17)
    minute = random.randint(0, 59)
    second = random.randint(0, 59)
    return datetime(date.year, date.month, date.day, hour, minute, second)

# STEP 1: Use your actual list of 165 files
file_list = r"""Changes
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on NESTED IF\NESTED IF NUMERIC & STRING COMPARISION\AcShopBill.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on NESTED IF\NESTED IF NUMERIC & STRING COMPARISION\AcShopInvoice.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on IF ELSE\IF ELSE STRING COMPARISION\Bill.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on SWITCH CASE\Bill.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on NESTED IF\NESTED IF NUMERIC & STRING COMPARISION\BuyPen.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Call-by-Reference_ Method\Call-by-Reference.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Call-by-Value_ Method\Call-by-Value.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Mathematical Calculation\CelciusToFahrenheit.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern3 - WHILE  LOOP\CheckArmstrong.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on IF ELSE\IF ELSE NUMERIC COMPARISION\CheckEvenOdd.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on SWITCH CASE\CheckMonth.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on NESTED IF\NESTED IF NUMERIC COMPARISION\CheckNo.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern4 - WHILE  LOOP\CheckPalindromeNo.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern4 - WHILE  LOOP\CheckPerfectNo.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on IF ELSE\IF ELSE NUMERIC COMPARISION\CheckPositiveNegativeNo.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern4 - WHILE  LOOP\CheckPrimeNo.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern4 - WHILE  LOOP\CheckPrimeNo_2.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on SWITCH CASE\CheckSeason.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Mathematical Calculation\CircleArea.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Mathematical Calculation\CircleCircumference.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Calss and Object_\Class and Object.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\Commit_Commands_for_Java_Files.csv
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on IF ELSE\IF ELSE STRING COMPARISION\CompareString.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on IF ELSE\IF ELSE STRING COMPARISION\CompareSurName.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Input\Concatenate_1.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Input\Concatenate_2.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Input\Concatenate_3.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Input\Concatenate_4.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Input\Console Input.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Output\Console Output.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Constructor_\Constructor.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern3 - WHILE  LOOP\CountDigit.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on EXCEPTION\Java Programs on ARITHMETIC EXCEPTION\Demo1.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on EXCEPTION\Java Programs on ARRAYINDEX EXCEPTION\Demo1.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on EXCEPTION\Java Programs on NULLPOINTER EXCEPTION\Demo1.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on EXCEPTION\Java Programs on ARITHMETIC EXCEPTION\Demo2.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on EXCEPTION\Java Programs on ARRAYINDEX EXCEPTION\Demo2.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on EXCEPTION\Java Programs on NULLPOINTER EXCEPTION\Demo2.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on EXCEPTION\Java Programs on ARITHMETIC EXCEPTION\Demo3.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on EXCEPTION\Java Programs on ARRAYINDEX EXCEPTION\Demo3.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on EXCEPTION\Java Programs on NULLPOINTER EXCEPTION\Demo3.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on EXCEPTION\Java Programs on ARRAYINDEX EXCEPTION\Demo4.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on EXCEPTION\Java Programs on NULLPOINTER EXCEPTION\Demo4.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on NESTED IF\NESTED IF NUMERIC COMPARISION\ElectricityBill.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on INHERITANCE\EmpInfo.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on IF ELSE\IF ELSE NUMERIC COMPARISION\EmployeeSalary.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Mathematical Calculation\EmployeeSalary.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern2 - WHILE  LOOP\EvenOdd.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Mathematical Calculation\FahrenheitToCelcius.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Input\FullName_1.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Input\FullName_2.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Input\FullName_3.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Input\FullName_4.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\generate_git_commits.py
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern4 - WHILE  LOOP\GetExponentialValue.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern4 - WHILE  LOOP\GetFactorialValue.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern2 - WHILE  LOOP\Highest.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on NESTED IF\NESTED IF NUMERIC COMPARISION\HighestOf3No.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on NESTED IF\NESTED IF NUMERIC COMPARISION\HighestOf4No.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on IF ELSE\IF ELSE NUMERIC COMPARISION\HighestValue.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on IF ELSE\IF ELSE NUMERIC COMPARISION\Invoice.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on IF ELSE\IF ELSE STRING COMPARISION\Invoice.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Mathematical Calculation\Invoice.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on NESTED IF\NESTED IF NUMERIC COMPARISION\Invoice.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on SWITCH CASE\Invoice.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs based on OOPS\Java Application based on OOPS.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Mathematical Calculation\Java Apps on Mathematical Calculation.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on NESTED IF\NESTED IF NUMERIC COMPARISION\LowestOf3No.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on NESTED IF\NESTED IF NUMERIC COMPARISION\LowestOf5No.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Mathematical Calculation\Marksheet.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Method Overloading_\Method Overloading.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Output\Msg1.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Output\Msg2.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Output\Msg3.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Output\Msg4.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Output\Msg5.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Output\Msg6.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Output\Msg7.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Output\Msg8.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Output\Msg9.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Output\Msg10.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Input\Name_1.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Input\Name_2.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Input\Name_3.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Input\Name_4.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on NESTED IF\NUMERIC & STRING COMPARISION - NESTED IF...ELSE.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on IF ELSE\NUMERIC COMPARISION - IF...ELSE.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on NESTED IF\NUMERIC COMPARISION - NESTED IF...ELSE.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Call-by-Value_ Method\OAddition.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Method Overloading_\OAddition.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Returning Value from a_Method to Caller_\OAddition.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on INHERITANCE\OBase.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Object Reference Variable_Assignment_\Object Reference Variable Assignment.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Constructor_\OBookShelf.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Constructor_\OChair.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Constructor_\OChair1.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Call-by-Reference_ Method\OComplex.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Calss and Object_\OComplex.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Object Reference Variable_Assignment_\OComplex.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Returning Reference from a Method to Caller_\OComplexNo.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Calss and Object_\ODistance.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Returning Reference from a Method to Caller_\ODistance.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _this_ Keyword\ODistance.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs based on OOPS\OEmployee.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Calss and Object_\OEmployee.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Calss and Object_\OInvoice.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on INHERITANCE\Order.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on INHERITANCE\Order2.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on INHERITANCE\Order3.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on INHERITANCE\Order4.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on INHERITANCE\Order5.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs based on OOPS\OStudent.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Calss and Object_\OStudent.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on INHERITANCE\OTest.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs based on OOPS\OTime.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Calss and Object_\OTime.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern1 - WHILE  LOOP.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern1 - WHILE  LOOP\Pattern1A.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern1 - WHILE  LOOP\Pattern1B.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern1 - WHILE  LOOP\Pattern1C.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern1 - WHILE  LOOP\Pattern1D.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern1 - WHILE  LOOP\Pattern1E.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern2 - WHILE  LOOP.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern3 - WHILE  LOOP.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern4 - WHILE  LOOP.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern5 - WHILE  LOOP.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern2 - WHILE  LOOP\PositiveEvenOdd.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern2 - WHILE  LOOP\PositiveNegative.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern4 - WHILE  LOOP\PrintFibonacciSeries.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern2 - WHILE  LOOP\Product.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Mathematical Calculation\ProductDifference.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Returning Reference from a Method to Caller_\Returning Reference from a Method to Caller.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _Returning Value from a_Method to Caller_\Returning Value from a Method to Caller.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern3 - WHILE  LOOP\ReverseDigit.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Mathematical Calculation\RightAngledTriangleArea.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern2 - WHILE  LOOP\Smallest.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern2 - WHILE  LOOP\SmallestHighest.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on IF ELSE\IF ELSE NUMERIC COMPARISION\SmallestValue.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern2 - WHILE  LOOP\Square.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on IF ELSE\STRING COMPARISION - IF...ELSE.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on IF ELSE\IF ELSE STRING COMPARISION\StringCompare.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on INHERITANCE\StudInfo.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern3 - WHILE  LOOP\Sum3Digit.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern3 - WHILE  LOOP\SumAlternate7Digit.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Mathematical Calculation\SumAverage.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern2 - WHILE  LOOP\SumAvg.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern3 - WHILE  LOOP\SumDigit.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern3 - WHILE  LOOP\SumReverse5Digit.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern3 - WHILE  LOOP\SumReverseOfDigit.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern5 - WHILE  LOOP\SumSeries_1.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern5 - WHILE  LOOP\SumSeries_2.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern5 - WHILE  LOOP\SumSeries_3.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern5 - WHILE  LOOP\SumSeries_4.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern5 - WHILE  LOOP\SumSeries_5.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern5 - WHILE  LOOP\SumSeries_6.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern5 - WHILE  LOOP\SumSeries_7.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on SWITCH CASE\SWITCH.......CASE.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on WHILE LOOP\Pattern2 - WHILE  LOOP\Table.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on EXCEPTION\Java Programs on NULLPOINTER EXCEPTION\test.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\OBJECT-ORIENTED PROGRAMS\Java Programs on _this_ Keyword\this - keyword.pdf
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on NESTED IF\NESTED IF NUMERIC & STRING COMPARISION\TvShopBill.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on NESTED IF\NESTED IF NUMERIC & STRING COMPARISION\TvShopInvoice.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on IF ELSE\IF ELSE NUMERIC COMPARISION\VoterEligibility.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Input\Wish_1.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Input\Wish_2.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Input\Wish_3.java
C:\Users\Owner\Workspace_Git\Rpranjan11\core-java-conceptual-programmes\PROCEDURAL PROGRAMS\Java Programs on Console Input\Wish_4.java""".strip().splitlines()

# STEP 2: Shuffle weekday dates
valid_dates = generate_weekdays(commit_months)
random_dates = random.choices(valid_dates, k=len(file_list))

# STEP 3: Write PowerShell script
with open("commit_script.ps1", "w", encoding="utf-8") as f:
    for path, date in zip(file_list, random_dates):
        ts = random_time(date).strftime("%Y-%m-%dT%H:%M:%S")
        filename = os.path.splitext(os.path.basename(path))[0]
        f.write(f'git add "{path}"\n')
        f.write(f'$env:GIT_AUTHOR_DATE="{ts}"\n')
        f.write(f'$env:GIT_COMMITTER_DATE="{ts}"\n')
        f.write(f'git commit -m "added {filename}"\n')
        f.write('git push origin main\n\n')

print("✅ PowerShell script 'commit_script.ps1' generated.")
