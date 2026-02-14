def solution(array):
    num = 0;
    answer = 0
    check = 0


    for v in set(array):
        # 찾아서 num에 넣어
        if array.count(v) > num :
            num = array.count(v)
            answer = v # 해당 값
            check = 1
        elif array.count(v) == num:
            check += 1
    if check == 1 :
        return answer
    else : return -1
