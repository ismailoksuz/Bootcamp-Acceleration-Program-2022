def StringChallenge(strParam):

  arr=strParam.split()
  for i in arr:
    if checker(i)==False:
      return False
  return True

def checker(strp):
  nums=[]
  index=[]
  for i in range(len(strp)):
    if(ord(strp[i])>=49 and ord(strp[i])<=59):
      nums.append(int(strp[i]))
      index.append(i)
  if(len(nums))!=3:
    return False
  if(index[2]-index[1]==1 and index[1]-index[0]==1):
    return False
  nums.sort()
  for i in range(len(nums)-1):
    if(nums[i]==nums[i+1]):
      return False
  return True
  
  
  
  
print StringChallenge(raw_input())
