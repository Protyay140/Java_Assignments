coupon_codes = {
    "monday" : 0.12,
    "tuesday" : 0.23,
    "wednesday" : 0.52,
    "thursday" : 0.83,
    "friday" : 0.32,
    "saturday" : 0.52,
    "sunday" : 0.33
}

amount = int(input("enter an amount : "));

for day in coupon_codes:
    print(f"for {day} discount rate is : {coupon_codes[day]*100}%");
    print("amount after discount : ",amount*coupon_codes[day]);