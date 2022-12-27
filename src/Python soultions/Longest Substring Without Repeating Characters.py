class Solution:
    # we will use a dicoinary to sotre the char and the lenght until we see equal index
    def lengthOfLongestSubstring(self, s: str) -> int: #example - abcdecfab
        sub = {}
        current = 0
        counter = 0
        longest = 0

        for i,letter in enumerate(s):
            if letter in sub and sub[letter] >= current:
                current = sub[letter]+1
                counter = i - sub[letter]
                sub[letter] = i

            else:
                sub[letter] = i
                counter +=1
                if counter > longest:
                    longest = counter

        return longest