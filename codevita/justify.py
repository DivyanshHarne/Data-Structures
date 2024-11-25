def max_words(words, n,m):
    cl = 0
    ln = 1
    wf = 0
    for w in words:
        wl = len(w)
        if cl + wl <= m:
            if cl > 0:
                cl += 1
            cl += wl
            wl += 1
        else: 
            ln += 1
            if ln > n:
                break
            cl = wl 
            wf += 1
    return wf 
k = int(input())
words = [input().strip() for _ in range(k)]
n,m = map(int, input().spilt())
print(max_words(words, n, m))