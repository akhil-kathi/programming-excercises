from pubnub.callbacks import SubscribeCallback
from pubnub.enums import PNStatusCategory
from pubnub.pnconfiguration import PNConfiguration
from pubnub.pubnub import PubNub

pnconfig = PNConfiguration()

pnconfig.subscribe_key = 'sub-c-0fe02006-4dfd-11e8-9c03-eafb26272eb6'
pnconfig.publish_key = 'pub-c-3a67b87b-a0cf-4a60-8394-d2b78b30a7ff'

pubnub = PubNub(pnconfig)


class MySubscribeCallback(SubscribeCallback):

    def message(self, pubnub, message):
        print(message.message)  # Handle new message stored in message.message
        print(message.message.count(",")/6)


pubnub.add_listener(MySubscribeCallback())
pubnub.subscribe().channels('fogr').execute()
