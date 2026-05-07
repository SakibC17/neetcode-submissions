class Solution:
    def isPalindrome(self, s: str) -> bool:
        for c in s:
            if self.alphaNum(c) == False:
                s = s.replace(c, "")
        s = s.lower()

        end = len(s) -1
        
        for i in range(len(s) // 2):
            if s[i] != s[end]:
                return False
            end -= 1
        return True

    def alphaNum(self, c):
            return (ord('A') <= ord(c) <= ord('Z') 
                    or ord('a') <= ord(c) <= ord('z') 
                    or ord('0') <= ord(c) <= ord('9'))

       