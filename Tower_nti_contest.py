str_n = (input().split(" "))
lenght_line = int(str_n[0])
lenght_of_line = int(str_n[1])
cnt_ring = int(str_n[2])
high_tower = int( str_n[3])
otv = lenght_line - lenght_of_line * cnt_ring
if (otv > 0 ) and (otv % high_tower == 0):
    print("Yes")
else:
    print("No") 