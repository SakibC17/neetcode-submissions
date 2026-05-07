class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        strDict1 = {}
        strDict2 = {}
        for l in s:
            if l in strDict1:
                strDict1[l] = strDict1[l] + 1
            else:
                strDict1[l] = 1
        for l in t:
            if l in strDict2:
                strDict2[l] = strDict2[l] + 1
            else:
                strDict2[l] = 1

        
        if strDict1 == strDict2:
            return True
            
        return False
        