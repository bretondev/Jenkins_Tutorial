# main.py

import operations

def main():

    try:
        print(f"➕ Adding 5 and 10 makes :       {operations.add(5, 10)}")
        print(f"➖ Subtracting 20 by 10 makes:  {operations.subtract(20, 10)}")
        print(f"✖️ Multiply 2 and 5 makes :  {operations.multiply(2, 5)}")

        try:
            print(f"➗ Dividing 20 by 10 makes:    {operations.divide(20, 10)}")
        except ValueError as e:
            print(f"⚠️ Divide Error: {e}")

    except Exception as e:
        print(f"❌ Unexpected error: {e}")

if __name__ == "__main__":
    main()
