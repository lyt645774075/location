# location
通过bean的自描述信息，生成route map，上层应用提供路由信息，可以定位到所有相关的bean集合，从而做一些操作


业务应用在做一些写操作之前，通常会检查当前写操作是否满足一些规则。而对单个规则而言，通常在多个写操作的节点都需要检查，
从而使得规则分布在各个写操作中，从而使得检查分散在各种代码块里。
