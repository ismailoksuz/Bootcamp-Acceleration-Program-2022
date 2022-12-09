def MathChallenge(num1,num2):

  if(num1==num2):
    return num1
  else:
    return findGCD(num1,num2)

def findGCD(big,sml):
  if(sml>big):
    tmp=sml
    sml=big
    big=tmp
  gcd=1
  i=1
  while(i<=sml):
    if(sml%i==0 and big%i==0):
      gcd=i
    i+=1
  return gcd

# keep this function call here 
print MathChallenge(raw_input())
