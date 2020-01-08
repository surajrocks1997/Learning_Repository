def factorial(n):
    i=n
    k=1
    while i >= 1:
        k=k*i
        i-=1
    return k

print(factorial(7))