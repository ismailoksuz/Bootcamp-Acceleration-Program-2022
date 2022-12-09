import re

def StringChallenge(strParam):

  opener = ['<b>','<i>','<em>','<div>','<p>']
  closer = ['</b>','</i>','</em>','</div>','</p>']
  written = []
  splitted = re.split('(<[^>]*>)',strParam)
  for words in splitted:
    if words in opener:
      written.append(words)
    elif words in closer:
      check = closer.index(words)
      if(len(written)>0) and (opener[check]==written[len(written)-1]):
        written.pop()
  if written:
    return written[-1].replace('<', '').replace('>', '')
  return True

# keep this function call here 
print StringChallenge(raw_input())
