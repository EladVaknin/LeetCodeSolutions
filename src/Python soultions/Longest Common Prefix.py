class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if len(strs) == 0:
            return ("")
        if len(strs) == 1:
            return (strs[0])
        current = strs[0]
        len_current = len(current)

        for i in strs[1:]:
            while current != i[0:len_current]:
                current = current[0:len_current-1]
                len_current -= 1

                if len_current == 0:
                    return ("")

        return current
