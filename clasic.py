cnt_test = int(input())
otv = []
for k in range (cnt_test):
    cnt_row = int(input())
    mas=[]
    answer=True
    mas_row = input().split()
    for i in range(cnt_row):
        if int(mas_row[i])>1:
            a = input().split()
            for h in a:
                if h in mas:
                    answer=False
                mas += [h]
        else:
            a=input()
            if a in mas:
                answer=False     
            mas += [a]       
    if answer:
        otv.append("Yes")
    else: 
        otv.append("No")
for z in otv :
    print (z)

