def StringChallenge(strParam):
  ints = ["1","2","3","4","5","6","7","8","9"]
  splitted = strParam.split()
  regex = splitted[0]
  word = splitted[1]
  j=0
  for i in range(len(regex)):
    if(regex[i]=="+"):
      if(word[j].isalpha()==False):
        return "false"
      else:

        j+=1
    elif(regex[i]=="$"):
      if(word[j] in ints):

        j+=1
      else:
        return "false"
    elif(regex[i]=="*"):
      if i+3<len(regex) and regex[i+1]=="{":
        num=int(regex[i+2])        
        if j+num-1<len(word):
          temp=word[j]
          for k in range(j,j+num-1):
            if(word[k]!=temp):
              return "false"

          j+=num
        else:
          return "false"
      else:
        temp=word[j]
        if j+2<len(word) and temp==word[j+1] and temp==word[j+2]:

          j+=3
        else:
          return "false"
        
  if(j!=len(word)):
    return "false"
  else:    
    return "true" 

print StringChallenge(raw_input())
