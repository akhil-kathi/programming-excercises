'''Tic-Tac-Toe Minimax Program by Peter'''

#Tutorial found at: http://giocc.com/concise-implementation-of-minimax-through-higher-order-functions.html'''
class GameState:
    def __init__(self,board):
        self.board = board
        self.winning_combos = [[0,1,2],[3,4,5],[6,7,8],[0,3,6],[1,4,7],[2,5,8],[0,4,8],[2,4,6]]
    def is_gameover(self):
        '''returns if a game_state has been won or filled up'''
        if self.board.count('X') + self.board.count('O') == 9:
            return True
        for combo in self.winning_combos:
            if (self.board[combo[0]] == 'X' and self.board[combo[1]] == 'X' and self.board[combo[2]] == 'X') or \
            (self.board[combo[0]] == 'O' and self.board[combo[1]] == 'O' and self.board[combo[2]] == 'O'):
                return True
        return False
    def get_possible_moves(self):
        '''returns all possible squares to place a character'''
        squares = []
        for index, square in enumerate(self.board):
            if square != 'X' and square != 'O':
                squares.append(index)
        return squares
    def get_next_state(self, move, our_turn):
        '''returns the gamestate with the move filled in'''
        copy = self.board[:]
        if our_turn:
            copy[move] = 'X'
        else:
            copy[move] = 'O'
        return GameState(copy)
'''Named evals instead of eval to respect the eval function. http://stackoverflow.com/questions/9383740/what-does-pythons-eval-do'''
def evals(game_state):
    '''score a game_state from the computers point of view, 1 = win, 0 = tie, -1 = lose'''
    for combo in game_state.winning_combos:
        if game_state.board[combo[0]] == 'X' and game_state.board[combo[1]] == 'X' and game_state.board[combo[2]] == 'X':
            return 1    
        elif game_state.board[combo[0]] == 'O' and game_state.board[combo[1]] == 'O' and game_state.board[combo[2]] == 'O':
            return -1
    else:
        return 0

'''max and min will call on each other recusively, until a terminal state'''
def max_play(game_state):
    '''if the game is over returns score, otherwise calls min_play on it's childen (possible moves from the state) and returns the maximum'''
    if game_state.is_gameover():
        return evals(game_state)
    return max(map(lambda move: min_play(game_state.get_next_state(move, True)), game_state.get_possible_moves()))
def min_play(game_state):
    '''if the game is over returns score, otherwise calls max_play on it's childen (possible moves from the state) and returns the minimum'''
    if game_state.is_gameover():
        return evals(game_state)
    return min(map(lambda move: max_play(game_state.get_next_state(move, False)), game_state.get_possible_moves()))

def minimax(game_state):
    '''returns the max of mapping the (move, score) tuple to the possible move using [1] of the tuple the (score)'''
    return max(map(lambda move: (move, min_play(game_state.get_next_state(move, True))), game_state.get_possible_moves()), key = lambda x: x[1])

def pretty_print(board):
    '''prints a list by 3 chars, joined by spaces'''
    print(' '.join(board[:3]))
    print(' '.join(board[3:6]))
    print(' '.join(board[6:9]))

'''starting board, assuming it is X's turn.'''
start_board = '_ _ _ ' + '_ O _ ' + '_ _ _'

'''Interpreting and printing start board'''
start_game_state = GameState(start_board.split(' '))
pretty_print(start_game_state.board)
'''Finding best possible move and score'''
move, score = minimax(start_game_state)
'''Displaying move and outcome'''
if score == 0:
    word = 'TIE'
elif score == 1:
    word = 'WIN'
else:
    word = 'LOSS, who rigged the board?!?'
print('X should go at index #',move, 'Which will always result in a ' + word) 
start_game_state.board[move] = 'X'
pretty_print(start_game_state.board)