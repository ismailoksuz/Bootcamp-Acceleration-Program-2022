def StringChallenge(strParam):
  num=0
  for i in range(0,len(strParam)):
    num+=calculate(strParam[i])
  return toOptimal(num)

def calculate(c):
  if c=='I':
    return 1
  elif c=='V':
    return 5
  elif c=='X':
    return 10
  elif c=='L':
    return 50
  elif c=='C':
    return 100
  elif c=='D':
    return 500
  else:
    return 1000

def toOptimal(num):
  res=""
  while(num>0):
    if num>=1000:
      num-=1000
      res+='M'
    elif num>=500:
      num-=500
      res+='D'
    elif num>=100:
      num-=100
      res+='C'
    elif num>=50:
      num-=50
      res+='L'
    elif num>=10:
      num-=10
      res+='X'
    elif num>=5:
      num-=5
      res+='V'
    else:
      num-=1
      res+='I'
  return res


print StringChallenge(raw_input())
