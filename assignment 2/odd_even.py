def oddGenerator():
    for i in range(1,20,2):
        yield i;
odd = oddGenerator();
print("10 odd numbers : ");
for n in odd:
    print(n);

def evenGenerator():
    for i in range(2,22,2):
        yield i;
even = evenGenerator();
print("\n\n10 even numbers : ");
for n in even:
    print(n);