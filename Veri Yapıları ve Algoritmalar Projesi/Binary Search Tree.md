## [7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.
  7 eklendi:
    
    7
  5<7, 7'nin soluna eklendi:
    
      7
     /
    5
  1<5, 5'nin soluna eklendi:
  
        7
       /
      5
     /
    1
  8>7, 7'nin sağına eklendi:
  
        7
       / \
      5   8
     /
    1
  3<5 ve 3>1, 1'in sağına eklendi:
  
        7
       / \
      5   8
     /
    1
     \
      3
      
   6>5 ve 6<8, 5'in sağına eklendi:
  
        7
       / \
      5   8
     / \
    1   6
     \
      3
   0<1, 1'in soluna eklendi:
  
          7
         / \
        5   8
       / \
      1   6
     / \
    0   3
   9>8, 8'in sağına eklendi:
  
          7
         / \
        5   8
       / \   \
      1   6   9
     / \
    0   3
   4<5 ve 4>3, 3'ün sağına eklendi:
  
          7
         / \
        5   8
       / \   \
      1   6   9
     / \
    0   3
         \
          4
   2>1 ve 2<3, 3'ün soluna eklendi:
  
          7
         / \
        5   8
       / \   \
      1   6   9
     / \
    0   3
       / \
      2   4
  
    
