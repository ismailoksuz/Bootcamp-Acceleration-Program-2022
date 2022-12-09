def ArrayChallenge(strArr):
  lngs = []
  for i in range(len(strArr)):
    lngs.append(len(strArr[i]))
  cnt=0
  res=""
  while cnt<3:
    temp=max(lngs)
    for i in range(len(lngs)):
      if lngs[i]==temp and cnt!=2:
        lngs[i]=0
        cnt+=1
      elif lngs[i]==temp and cnt==2:
        res=strArr[i]
        cnt+=1
  return res




# keep this function call here 
print ArrayChallenge(raw_input())
