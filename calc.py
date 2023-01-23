print("---------------------------")
print("Kalkulator Sederhana Python")
print("---------------------------\n")
print("1. Penjumlahan \t [+]")
print("2. Pengurangan \t [-]")
print("3. Perkalian  \t  [*]")
print("4. Pembagian  \t  [/]")

pil = int(input("\nMasukan Pilihan Operasi : "))

x= int(input("Bilangan 1 : "))
y= int(input("Bilangan 2 : "))

if pil == 1:
   hasil = x+y
elif pil == 2:
   hasil = x-y
elif pil == 3:
   hasil = x*y
elif pil == 4:
   hasil = x/y

print("\nHasil : %d" %hasil)
