def main():
    print(recursive_factorial(5))

def recursive_factorial(n: int)-> int:
    if n < 0:
        raise ValueError
    
    if n == 0:
        return 1

    return n * recursive_factorial(n - 1)
   
    
if __name__ == "__main__":
    main()

    