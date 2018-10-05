
def find_start(ship):
    for i in range(len(ship)):
        
 
        for j in range(len(ship[i])):
    
            if ship[i][j]=='s':
                mas=[j,i]
                return mas
n,m=input().split()
record = 100000000
def begin(ship,n,m):
    global cost
    for i in range(n):
        row = str(input())
        row1=[]
        row2 = []
        for j in row:
            row1+=[j]
            row2.append(1000)
        ship.append(row1)
        cost.append(row2)
    return(ship)


def find_finish(ship):
    for i in range(len(ship)):
        for j in range(len(ship[i])):
            if ship[i][j]=='f':
                mas = [j,i]
                return mas
def add_new_point(new_point,front,fin):
    global ship,cost,record
    if ship[new_point["y"]][new_point["x"]] == "#":
        return
    if cost[new_point["y"]][new_point["x"]]<new_point["time"]-1:
        return

    if new_point["x"] == fin[0] and new_point["y"] == fin[1]:
        if record > new_point["time"]:
            record = new_point["time"]
    else:
        front.append(new_point)
    if cost[new_point["y"]][new_point["x"]]>new_point["time"]:
        cost[new_point["y"]][new_point["x"]]=new_point["time"]

    
def main(width, heigth):
    global ship,cnt
    begin(ship,n,m)
    cnt =0
    front = []
    fin = find_finish(ship)
    s = find_start(ship)
    start={
        "x":s[0],
        "y":s[1],
        "time":0,
        "dir":"down"
    }
    front.append(start)
    while len(front) != 0:
        current = front[0]
        cnt+=1
        del(front[0])
        if current["x"] > 0 and current["dir"]!="right":
            if current["dir"] == "left":
                price = 1
            else:
                price = 2

            new_point={
                "x":current["x"]-1,
                "y":current["y"],
                "time":current["time"]+price,
                "dir":"left"
            }
            add_new_point(new_point,front,fin)
        if current["x"]+1 < width and current["dir"]!="left":
            if current["dir"] == "right":
                price = 1
            else:
                price = 2

            new_point={
                "x":current["x"]+1,
                "y":current["y"],
                "time":current["time"]+price,
                "dir":"right"
            }
            add_new_point(new_point,front,fin)
        if current["y"]> 0 and current["dir"]!="down":
            if current["dir"] == "up":
                price = 1
            else:
                price = 2

            new_point={
                "x":current["x"],
                "y":current["y"]-1,
                "time":current["time"]+price,
                "dir":"up"
            }
            add_new_point(new_point,front,fin)
        if current["y"]+1 < heigth and current["dir"]!="up":
            if current["dir"] == "down":
                price = 1
            else:
                price = 2

            new_point={
                "x":current["x"],
                "y":current["y"]+1,
                "time":current["time"]+price,
                "dir":"down"
            }
            add_new_point(new_point,front,fin)
n=int(n)
m=int(m)
fin = []
ship=[]
cost = []
time=0
ship = []
main(m,n)
if (record == 100000000 ):
    print(-1)
else:
    print(record)
