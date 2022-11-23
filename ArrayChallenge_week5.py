def ArrayChallenge(strArr):
  cnt="";
  for i in range(0,len(strArr[0])):
    if strArr[0][i]==strArr[1][i] and strArr[0][i]=="1":
      cnt+="1"
    else:
      cnt+="0"
  return cnt

print ArrayChallenge(raw_input())
