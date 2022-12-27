from typing import List

class FindDuplecates:
    @staticmethod
    def find_duplicates (self,nums:List[int])->List[int]:
        result = []
        for i in range(len(nums)):
            if i in result == false:
                result.append(i)

        return result

    def main ():
        arr = [1,1,1,3,4,5]
        find_duplicates(arr)


    if __name__ == '__main__':
        main()

