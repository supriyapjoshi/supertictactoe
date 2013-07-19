class SingleBoard
  def initialize
    @board = {"1"=>0,"2"=>0,"3"=>0,"4"=>0,"5"=>0,"6"=>0,"7"=>0,"8"=>0,"9"=>0}
  end
  def emptyspaces?
    empty =9
    @board.each_key  {|key|
      if @board[key] == 1
        empty = empty - 1
      end
    }
      empty
    end


end

