def is_prime(x):
    if(x==1):
        return False;
    for i in range(2,x):
        if x%i == 0 :
            return False;
        return True;
    
number1 = int(input("enter the lower bound : "));
number2 = int(input("enter the upper bound : "));

for num in range(number1,number2+1):
    if(is_prime(num)):
        print(num);
