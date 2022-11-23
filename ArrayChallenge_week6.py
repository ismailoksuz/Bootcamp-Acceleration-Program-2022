def ArrayChallenge(strArr):
  searching=strArr[1].split(',')
  search=strArr[0]
  lng=0
  mid=0
  first=[]
  second=[]
  for i in range(0,len(searching)):
    lng=len(searching[i])
    if searching[i]==search[0:lng]:
      first.append(searching[i])
  rev=search[::-1]
  revlist=[y[::-1] for y in searching]
  for j in range(0,len(revlist)):
    lng=len(revlist[j])
    if revlist[j]==rev[0:lng]:
      second.append(revlist[j])
  normalized=[u[::-1] for u in second]
  resarr=[]
  for k in range(0,len(first)):
    for m in range(0,len(normalized)):
      if first[k]+normalized[m]==search:
        resarr.append(first[k])
        resarr.append(normalized[m])
        break
  return(resarr[0]+","+resarr[1])
  

# keep this function call here 
print ArrayChallenge(raw_input())
