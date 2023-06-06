phone_number_string = input("enter the phone number : ");
length = len(phone_number_string);

first_digit = int(phone_number_string[0]);

# phone_number = int(phone_number_string);

digits = [0,1,2,3,4,5,6,7,8,9];

first_digits = [6,7,8,9];



flag=0;

if((length == 10)):
   if first_digit in first_digits :
        for d in phone_number_string:
            if int(d) in digits:
                flag +=1;

if(flag == 0):
    print("phone number is not valid");
else:
    print("phone number is valid");
    