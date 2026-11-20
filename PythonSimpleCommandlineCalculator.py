def calculator():
    operations = {
        '1': ('+', lambda x, y: x + y),
        '2': ('-', lambda x, y: x - y),
        '3': ('*', lambda x, y: x * y),
        '4': ('/', lambda x, y: "Error: Division by zero" if y == 0 else x / y)
    }

    print("--- Simple Python Calculator ---")
    for key, (symbol, _) in operations.items():
        print(f"{key}. Operation ({symbol})")
    print("5. Exit")

    while True:
        choice = input("\nEnter choice (1/2/3/4/5): ").strip()
        if choice == '5':
            print("Exiting calculator. Goodbye!")
            break
        if choice in operations:
            try:
                n1, n2 = float(input("First number: ")), float(input("Second number: "))
                symbol, func = operations[choice]
                print(f"Result: {n1} {symbol} {n2} = {func(n1, n2)}")
            except ValueError:
                print("Invalid input. Please enter numeric values.")
        else:
            print("Invalid selection. Please choose 1-5.")

if __name__ == "__main__":
    calculator()
