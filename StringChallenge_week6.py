def returnLower(char):
  return char.lower()

def returnUpper(char):
  return char.upper()

def StringChallenge(strParam):
  indexes=[]
  for i in range(0,len(strParam)):
    if strParam[i].isalpha()==False:
      indexes.append(i)
  startindexes=[0]
  for j in range(len(indexes)):
    startindexes.append(indexes[j]+1)
  indexes.append(len(strParam))
  out=[]
  for m in range(0,len(indexes)):
    out.append(strParam[startindexes[m]:indexes[m]])
  newout=map(list,out)
  result=""
  for u in range(0,len(newout)):
    for h in range(0,len(newout[u])):
      if u!=0 and h==0:
        result+=returnUpper(newout[u][h])
      else:
        result+=returnLower(newout[u][h])
    
  
  return result

# keep this function call here 
print StringChallenge(raw_input())
