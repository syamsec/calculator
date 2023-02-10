print("---------------------------")
print("Kalkulator Sederhana Python")
print("---------------------------\n")
print("1. Penjumlahan \t [+]")
print("2. Pengurangan \t [-]")
print("3. Perkalian  \t [*]")
print("4. Pembagian  \t [/]")
print("====================\n")

def calculator():
    # Meminta input dari pengguna
        
    operator = input("Masukkan operator (1, 2, 3, 4): ")
    num1 = float(input("Masukkan angka pertama: "))
    num2 = float(input("Masukkan angka kedua: "))
    
    # Melakukan operasi matematika sesuai dengan operator yang dimasukkan
    if operator == "1":
        result = num1 + num2
        print("Hasil:", result)
    elif operator == "2":
        result = num1 - num2
        print("Hasil:", result)
    elif operator == "3":
        result = num1 * num2
        print("Hasil:", result)
    elif operator == "4":
        result = num1 / num2
        print("Hasil:", result)
    else:
        print("Operator tidak valid.")

# Memanggil fungsi calculator
calculator()
