def MathChallenge(num):

  if num>1:
    return isPrime(num)
  return False

def isPrime(num):
  upper=int(num/2)+1
  for i in range(2,upper):
    if num%i==0:
      return False
  return True

print MathChallenge(raw_input())
