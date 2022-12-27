class Solution:
    def longestPalindrome(self, s: str) -> str:

        def check_palindrome(s):
            return (s==s[::-1]) #return true if it equal to reverse s and false if not

        # check all substring
        for length in range (len(s),0,-1):
            for start_index in range (0,len(s)+1-length):
                if check_palindrome(s[start_index:(start_index+length)]):
                    return s[start_index:(start_index+length)]


