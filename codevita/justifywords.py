def max_words_fitted(k, words, n, m):
    # filter out words that can't fit in a single line
    words = [word for word in words if len(word) <= m]

    def backtrack(index, lines):
        # If we've exhausted the word list, return the count of placed words
        if index == len(words):
            return sum(len(line.split()) for line in lines)

        max_words = 0
        word = words[index]

        for i in range(len(lines)):
            # check if the word can be appended to the current line
            if len(lines[i]) + len(word) + (1 if lines[i] else 0) <= m:
                original_line = lines[i]
                lines[i] += (" " if lines[i] else "") + word
                max_words = max(max_words, backtrack(index + 1, lines))
                lines[i] = original_line  # backtrack

        # Try placing the word in a new line if lines are available
        if len(lines) < n:
            lines.append(word)
            max_words = max(max_words, backtrack(index + 1, lines))
            lines.pop()  # Backtrack

        return max_words

    # Start the backtracking with an empty set of lines
    return backtrack(0, [])


# Input reading
k = int(input())  # number of words
words = [input().strip() for _ in range(k)]  # list of words
n, m = map(int, input().split())  # n: number of lines, m: max characters per line

# Compute and print the result
print(max_words_fitted(k, words, n, m))