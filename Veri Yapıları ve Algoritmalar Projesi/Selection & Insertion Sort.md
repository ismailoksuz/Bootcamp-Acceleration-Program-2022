# [22,27,16,2,18,6] -> Insertion Sort
### Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
    - 2 en küçük olduğu için 22 ile yer değiştirerek başa gelir => [2,27,16,22,18,6]
    - 2'den büyük en küçük sayı 6 da 2. indexde yer alan 27 ile yer değiştirir => [2,6,16,22,18,27]
    - 6'dan büyük en küçük sayı olan 16 olması gereken indexdedir.
    - 16'dan büyük en küçük sayı olan 18, 22 ile yer değiştirir. => [2,6,16,18,22,27]
    - 18'den büyük en küçük sayı olan 22 olması gereken indexdedir.
    - 27 de olması gereken yerdedir. 
    Sonuç => [2,6,16,18,22,27]
<br>

### Big-O gösterimini yazınız.
    6 adımda bu sortingi tamamladık.
    - İlk adımda 6 işlem
    - İkinci adımda 6-1 işlem
    - Üçüncü adımda 6-2 işlem
    - Dördüncü adımda 6-3 işlem
    - Beşinci adımda 6-4 işlem
    - Altıncı adımda 6-5 işlem
    Yani toplamda 6'ya x dersek x+(x-1)+...+(x-5) işlem yapılmıştır.
    Bu formül x*(x-1)/2'ye eşittir. => (x²+x)/2
    O((x²+x)/2 = O(x²)
<br>

### Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer?
    Average case: Aradığımız sayının ortada olması.
    Worst case: Aradığımız sayının sonda olması.
    Best case: Aradığımız sayının dizinin en başında olması.
  Bu durumda, bizim aradaığımız sayı olan 18 dizide ortada olduğu için;<br>
    Average case durumuna girer.
<br>
<br>
# [7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımını yazınız.
    1- En küçük değer olan 2, başa geldi. [2,3,5,8,7,9,4,15,6]
    2- 2'den büyük en küçük değer olan 3, yerini korudu. [2,3,5,8,7,9,4,15,6]
    3- 3'den büyük en küçük değer olan 4,3. indexe geldi. [2,3,4,8,7,9,5,15,6]
    4- 4'den büyük en küçük index olan 5,4. indexe geldi. [2,3,4,5,7,9,8,15,6]
