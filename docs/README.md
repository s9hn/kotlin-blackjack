### 🎯 기능목록 사항

### 🔽 로그인 뷰

***

- [ ] 게임에 참여할 사람 이름을 입력받는다.
    - [ ] 쉼표 기준으로 분리한다.
    - [ ] 널값이 들어올 수 없다.
    - [ ] 게임 참가자들의 이름은 중복될 수 없다.

### 🔽 플레이게임 뷰

***

- [ ] 딜러와 참가자들에게 2장의 카드를 지급한다.
    - [ ] 딜러는 첫 번째 카드만 출력한다.
- [ ] 참가자들에게 추가 카드를 물어본다.
    - [ ] 'n'이 나올 때 까지, 반복한다.
    - [ ] 'y', 'n'만 입력 가능하다.
- [ ] 딜러의 카드의 합이 16이하일 경우, 1장의 카드를 추가 지급한다.
    - [ ] 17이상이면 받을 수 없다.

### 🔽 게임결과 뷰

***

- [ ] 딜러를 포함한 모든 참가자들의 카드와 총합을 공개한다.
- [ ] 최종 승패를 출력한다.
    - [ ] 딜러-참가자 1대1의 승부로 승패를 계산한다

---

## CardMachine

- 카드 목록을 가지고 있다.
- 참여자의 수만큼(딜러포함) 랜덤 카드를 2개씩 뽑는다.
    - 뽑은 카드들은 Remove되며, 이후 추가카드는 남은 카드 목록에서 뽑는다.

## Player

- 소지한 카드의 합을 계산한다.

## Dealer

- 소지한 카드의 합을 계산한다.
    - 2장의 합이 16이하일 경우, 카드 1장을 추가로 받는다.

## GameResult

- 딜러와 플레이어의 카드목록을 들고 있다.
    - 각 카드목록의 총합을 알고 있다.
- 딜러와 각 플레이어의 승부를 계산한다. 