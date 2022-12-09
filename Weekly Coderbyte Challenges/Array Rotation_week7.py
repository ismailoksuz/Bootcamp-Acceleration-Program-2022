def ArrayChallenge(arr):
  si=arr[0]
  rotated=[]
  for i in range(si,len(arr)):
    rotated.append(arr[i])
  for j in range(0,si):
    rotated.append(arr[j])
  return ''.join(map(str,rotated))

# keep this function call here 
print ArrayChallenge(raw_input())
